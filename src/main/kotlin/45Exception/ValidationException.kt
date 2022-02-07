package `45Exception`

// disarankan membuat Exception sendiri seperti ini dari pada smuaa nya menggunakan kelas Throwable
class ValidationException(message: String) : Throwable(message)