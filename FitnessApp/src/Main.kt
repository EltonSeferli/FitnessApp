fun main() {
    val workouts = mutableListOf<Workout>()
    val exercises = mutableListOf<Exercise>()
    val meals = mutableListOf<Meal>()

    while (true) {
        println("\n--- Fitness App Menu ---")
        println("1. Add Workout")
        println("2. Add Exercise")
        println("3. Add Meal")
        println("4. View Workouts")
        println("5. View Exercises")
        println("6. View Meals")
        println("0. Exit")
        print("Choose an option: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Workout Name: ")
                val name = readLine()!!
                print("Program Duration (weeks): ")
                val duration = readLine()!!.toInt()
                print("Program Description: ")
                val programDesc = readLine()!!
                print("Workout Name: ")
                val workoutName = readLine()!!
                print("Workout Duration (minutes): ")
                val workoutDuration = readLine()!!.toInt()
                print("Workout Description: ")
                val workoutDesc = readLine()!!
                print("Workout Intensity: ")
                val intensity = readLine()!!

                workouts.add(
                    Workout(
                        name, duration, programDesc,
                        workoutName, workoutDuration, workoutDesc, intensity
                    )
                )
                println("Workout added successfully!")
            }
            2 -> {
                print("Exercise Name: ")
                val exName = readLine()!!
                print("Duration (minutes): ")
                val exDuration = readLine()!!.toInt()
                print("Description: ")
                val exDesc = readLine()!!
                print("Calories Burned: ")
                val calories = readLine()!!.toFloat()

                exercises.add(Exercise(exName, exDuration, exDesc, calories))
                println("Exercise added successfully!")
            }
            3 -> {
                print("Meal Name: ")
                val mealName = readLine()!!
                print("Meal Description: ")
                val mealDesc = readLine()!!
                print("Calories: ")
                val calories = readLine()!!.toFloat()

                meals.add(Meal(mealName, mealDesc, calories))
                println("Meal added successfully!")
            }
            4 -> {
                println("\n--- Workouts ---")
                workouts.forEach { println(it.programDetails()) }
            }
            5 -> {
                println("\n--- Exercises ---")
                exercises.forEach { println("${it.getExerciseName()} - ${it.getCaloriesBurned()} cal") }
            }
            6 -> {
                println("\n--- Meals ---")
                meals.forEach { println("${it.getMealName()} - ${it.getCalories()} cal") }
            }
            0 -> {
                println("Exiting...")
                return
            }
            else -> println("Invalid option. Try again.")
        }
    }
}