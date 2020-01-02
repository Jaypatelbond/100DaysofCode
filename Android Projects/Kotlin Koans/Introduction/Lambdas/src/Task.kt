fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 42 == 0 }
