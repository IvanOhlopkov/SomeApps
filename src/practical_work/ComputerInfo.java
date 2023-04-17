package practical_work;
public class ComputerInfo {
    public String getComputerInfo() {
        String message = "Информация о системе" + "\n" +
                "Операционная система: " + System.getProperty("os.name") + " " + System.getProperty("os.version") + "\n" +
                "Количество ядер процессора: " + Runtime.getRuntime().availableProcessors() + "\n" +
                "Количество памяти, доступной JVM: " + Runtime.getRuntime().maxMemory() / 1024 / 1024 +
                "Mb";
        return message;
    }
}
