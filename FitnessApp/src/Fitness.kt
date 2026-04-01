abstract class Fitness(
    private var programName: String,
    private var programDuration: Int,
    private var programDescription: String
) {
    fun getProgramName() = programName
    fun setProgramName(name: String) { programName = name }

    fun getProgramDuration() = programDuration
    fun setProgramDuration(duration: Int) { programDuration = duration }

    fun getProgramDescription() = programDescription
    fun setProgramDescription(description: String) { programDescription = description }

    abstract fun programDetails(): String
}