import 'package:flutter/material.dart';
import '../models/item_model.dart';

class ItemDetailScreen extends StatelessWidget {
  final ItemModel item;

  ItemDetailScreen({required this.item});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(item.title)),
      body: Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          children: [
            Text(item.title, style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold)),
            SizedBox(height: 10),
            Text(item.description, style: TextStyle(fontSize: 16)),
          ],
        ),
      ),
    );
  }
}
