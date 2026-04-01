class Exercise(
    private var exerciseName: String,
    private var exerciseDuration: Int,
    private var exerciseDescription: String,
    private var caloriesBurned: Float
) {
    fun getExerciseName() = exerciseName
    fun setExerciseName(name: String) { exerciseName = name }

    fun getExerciseDuration() = exerciseDuration
    fun setExerciseDuration(duration: Int) { exerciseDuration = duration }

    fun getExerciseDescription() = exerciseDescription
    fun setExerciseDescription(description: String) { exerciseDescription = description }

    fun getCaloriesBurned() = caloriesBurned
    fun setCaloriesBurned(calories: Float) { caloriesBurned = calories }
}