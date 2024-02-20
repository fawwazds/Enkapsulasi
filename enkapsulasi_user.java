package enkapsulasi_user;

public class enkapsulasi_user {

    public static void main(String[] args) {
        User fawwaz = new User("a","b",1,true);

        fawwaz.setUsername("fawwaz");
        fawwaz.setPassword("haloguys");
        fawwaz.setId(123832748);
        fawwaz.setStatus(true);

        System.out.println("Username: " + fawwaz.getUsername());
        System.out.println("Password: " + fawwaz.getPassword());
        System.out.println("Id: " + fawwaz.getId());
        System.out.println("Status: " + fawwaz.getStatus());
    }

}
