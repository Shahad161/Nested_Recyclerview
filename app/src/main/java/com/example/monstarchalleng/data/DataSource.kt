package com.example.monstarchalleng.data

import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Category

object DataSource {
    fun getCategory(): List<Category> = listOf(
        Category(description = "Pet Adoption", "https://static.vecteezy.com/system/resources/previews/001/481/849/large_2x/pet-adoption-with-cute-little-cats-vector.jpg"),
        Category(description = "Pet Care", "https://static.vecteezy.com/system/resources/previews/002/657/069/large_2x/cute-cat-take-bath-cartoon-character-free-vector.jpg"),
        Category(description = "Pet Shop", "https://static.vecteezy.com/system/resources/previews/002/613/769/non_2x/pet-shop-veterinary-with-food-animals-vector.jpg"),
        Category(description = "Small Pet", "https://static.vecteezy.com/system/resources/previews/000/152/772/large_2x/free-gerbil-vector.png"),
        Category(description = "Pet Vaccination", "https://image.freepik.com/free-vector/cute-shiba-inu-design-with-mask-vaccine_454510-35.jpg"),
        Category(description = "Cat", "https://image.freepik.com/free-vector/cute-cat-holding-fish-balloon_138676-1193.jpg"),
        Category(description = "Dog", "https://static.vecteezy.com/system/resources/previews/000/129/025/large_2x/vector-papillon-dog.jpg"),
        Category(description = "Bird", "https://static.vecteezy.com/system/resources/previews/001/963/388/non_2x/couple-owl-and-bird-house-vector.jpg"),
    )

    fun getPosts(): List<Post> = listOf(
        Post(name = "Amelio's Cat",time = "1hour",share = "22",like = "2.2k", price = "16.00", postImgUrl = "https://image.freepik.com/free-photo/red-white-cat-pink-studio-background_155003-22081.jpg"),
        Post(name = "Roma's Dog",time = "17min",share = "5",like = "1k", price = "18.00", postImgUrl = "https://image.freepik.com/free-photo/adorable-white-little-puppy_23-2148985894.jpg"),
        Post(name = "Pope's Doge",time = "5hour",share = "10",like = "500", price = "20.00", postImgUrl = "https://image.freepik.com/free-photo/beagle-tricolor-puppy-is-posing_155003-31772.jpg"),
        Post(name = "Andy's Cat",time = "55min",share = "20",like = "1.3k", price = "10.00", postImgUrl = "https://image.freepik.com/free-photo/young-cat-sitting_155003-27715.jpg"),
        Post(name = "Bella's Dog",time = "30min",share = "33",like = "800", price = "30.00", postImgUrl = "https://image.freepik.com/free-photo/love-my-home-welsh-corgi-pembroke-puppy-is-posing-cute-fluffy-doggy-pet-is-sitting-isolated-red-background-studio-photoshot-negative-space-insert-your-text-image_155003-34629.jpg"),
        Post(name = "Lucy's Dog",time = "2Hour",share = "29",like = "5.5k", price = "32", postImgUrl = "https://image.freepik.com/free-photo/studio-shot-berner-sennenhund-puppy-yellow-studio-background_155003-36297.jpg"),
        Post(name = "Simba's Cat",time = "3Hour",share = "76",like = "2.8k", price = "44.00", postImgUrl = "https://image.freepik.com/free-photo/closeup-cute-kitten-resting-sofa_181624-37234.jpg"),
        Post(name = "Oreo's Cat",time = "7Hour",share = "34",like = "9.2k", price = "25.00", postImgUrl = "https://static.vecteezy.com/system/resources/previews/001/271/707/non_2x/cat-on-purple-background-free-photo.jpg"),
        Post(name = "Brian's Cat",time = "1day",share = "56",like = "2k", price = "31.00", postImgUrl = "https://image.freepik.com/free-photo/cute-sphynx-cat-kitty-posing-isolated-wall_155003-33627.jpg"),
    )
}