class Workout(
    programName: String,
    programDuration: Int,
    programDescription: String,
    private var workoutName: String,
    private var workoutDuration: Int,
    private var workoutDescription: String,
    private var workoutIntensity: String,
) : Fitness(programName, programDuration, programDescription) {
    fun getWorkoutName() = workoutName
    fun setWorkoutName(name: String) { workoutName = name }

    fun getWorkoutDuration() = workoutDuration
    fun setWorkoutDuration(duration: Int) { workoutDuration = duration }

    fun getWorkoutDescription() = workoutDescription
    fun setWorkoutDescription(description: String) { workoutDescription = description }

    fun getWorkoutIntensity() = workoutIntensity
    fun setWorkoutIntensity(intensity: String) { workoutIntensity = intensity }

    override fun programDetails(): String {
        return "Workout: $workoutName, Duration: $workoutDuration mins, Intensity: $workoutIntensity"
    }
}
