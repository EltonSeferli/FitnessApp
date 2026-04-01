interface Nutrition {
    fun calculateCalories(weight: Float, height: Float, age: Int, activityLevel: Float): Float
    fun logMeal(meal: Meal)
}