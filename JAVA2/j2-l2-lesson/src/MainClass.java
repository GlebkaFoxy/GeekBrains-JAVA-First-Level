public class MainClass {
    public static void main(String[] args) {
        UserForm userForm = new UserForm();
        try {
            userForm.fillUserForm("Iv", "ivan@ivan.com");
        } catch (ValidationException e) {
            System.out.println("В блоке обработки ошибки");
//            System.out.println(e.getSimpleString());
            e.printStackTrace();
            //System.exit(0);
        }
        System.out.println("Завершение работы");
    }
}
