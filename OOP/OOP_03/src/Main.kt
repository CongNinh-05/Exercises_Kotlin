//https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects

fun main() {
    var smartDevice: SmartDevice = SmartTVDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}
