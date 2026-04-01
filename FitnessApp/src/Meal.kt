class Meal(
    private var mealName: String,
    private var mealDescription: String,
    private var calories: Float
) {
    fun getMealName() = mealName
    fun setMealName(name: String) { mealName = name }

    fun getMealDescription() = mealDescription
    fun setMealDescription(description: String) { mealDescription = description }

    fun getCalories() = calories
    fun setCalories(calories: Float) { this.calories = calories }
}