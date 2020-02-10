public class Application {
    public static void main(String[] args) {
        WindowsApp intelliJ = new IntelliJ();
        WindowsApp chorme = new Chrome();
        WindowsApp weChat = new WeChat();

        System.out.println("- IntelliJ IDEA -");
        intelliJ.pressF5();
        System.out.println("- Chrome -");
        chorme.pressF5();
        System.out.println("- WeChat -");
        weChat.pressF5();
    }
}
