class ItemModel {
  String id;
  String title;
  String description;
  String? imageUrl; // Optional field for image URL

  ItemModel({
    required this.id,
    required this.title,
    required this.description,
    this.imageUrl, // Optional parameter
  });

  // Convert the object into a JSON format to store in Firestore
  Map<String, dynamic> toJson() => {
        'id': id,
        'title': title,
        'description': description,
        'imageUrl': imageUrl ?? '', // Ensure an empty string if null
      };

  // Factory constructor to create an ItemModel object from Firestore data
  static ItemModel fromJson(Map<String, dynamic> json) => ItemModel(
        id: json['id'] ?? '',
        title: json['title'] ?? '',
        description: json['description'] ?? '',
        imageUrl: json['imageUrl'] ?? '', // Ensure proper handling of missing image
      );
}
