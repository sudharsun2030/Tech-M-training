import 'package:flutter/material.dart';
import 'package:image_picker/image_picker.dart';
import 'package:firebase_storage/firebase_storage.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'dart:io';
import 'package:your_app/localization/app_localizations.dart';

class AddItemScreen extends StatefulWidget {
  @override
  _AddItemScreenState createState() => _AddItemScreenState();
}

class _AddItemScreenState extends State<AddItemScreen> {
  final TextEditingController _titleController = TextEditingController();
  final TextEditingController _descriptionController = TextEditingController();
  File? _selectedImage;

  Future<void> _pickImage() async {
    final picker = ImagePicker();
    final pickedFile = await picker.pickImage(source: ImageSource.gallery);

    if (pickedFile != null) {
      setState(() {
        _selectedImage = File(pickedFile.path);
      });
    }
  }

  Future<String> _uploadImage(File image) async {
    final storageRef = FirebaseStorage.instance
        .ref()
        .child('lost_items/${DateTime.now().toIso8601String()}');
    final uploadTask = await storageRef.putFile(image);
    return await uploadTask.ref.getDownloadURL();
  }

  Future<void> _submitItem() async {
    if (_titleController.text.isEmpty ||
        _descriptionController.text.isEmpty ||
        _selectedImage == null) {
      ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text(AppLocalizations.of(context)!.translate('no_image'))));
      return;
    }

    try {
      final imageUrl = await _uploadImage(_selectedImage!);

      await FirebaseFirestore.instance.collection('lost_items').add({
        'title': _titleController.text,
        'description': _descriptionController.text,
        'image_url': imageUrl,
      });

      ScaffoldMessenger.of(context)
          .showSnackBar(SnackBar(content: Text(AppLocalizations.of(context)!.translate('submit'))));
      Navigator.pop(context);
    } catch (e) {
      ScaffoldMessenger.of(context)
          .showSnackBar(SnackBar(content: Text('Error: $e')));
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(AppLocalizations.of(context)!.translate('add_item')),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: _titleController,
              decoration: InputDecoration(labelText: AppLocalizations.of(context)!.translate('title')),
            ),
            TextField(
              controller: _descriptionController,
              decoration: InputDecoration(labelText: AppLocalizations.of(context)!.translate('description')),
            ),
            SizedBox(height: 16),
            _selectedImage == null
                ? Text(AppLocalizations.of(context)!.translate('no_image'))
                : Image.file(_selectedImage!, height: 150),
            ElevatedButton(
              onPressed: _pickImage,
              child: Text(AppLocalizations.of(context)!.translate('select_image')),
            ),
            SizedBox(height: 16),
            ElevatedButton(
              onPressed: _submitItem,
              child: Text(AppLocalizations.of(context)!.translate('submit')),
            ),
          ],
        ),
      ),
    );
  }
}
