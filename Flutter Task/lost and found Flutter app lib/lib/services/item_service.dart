import 'package:cloud_firestore/cloud_firestore.dart';
import '../models/item_model.dart';

class ItemService {
  final CollectionReference _itemsCollection = FirebaseFirestore.instance.collection('items');

  Future<void> addItem(ItemModel item) {
    return _itemsCollection.doc(item.id).set(item.toJson());
  }

  Stream<List<ItemModel>> getItems() {
    return _itemsCollection.snapshots().map((snapshot) =>
        snapshot.docs.map((doc) => ItemModel.fromJson(doc.data() as Map<String, dynamic>)).toList());
  }
}
