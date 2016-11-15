public class User implements IUser {
    private String name;
    private String password;
    private int typ;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        return this.name = name;
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password) == true){
            return this.password = password;
        }else throw new RuntimeException("Password is not correct.");

    }

    @Override
    public boolean isPasswordCorrect(String password) {
        String tmp = "^(?=A-Z)(?=a-z)$";
        if (password == null) throw new RuntimeException("Not known.");
        if (password.matches(tmp)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int getType() {
        if(typ == 0 || typ >=3) {
            throw new RuntimeException("Typ is not true.");
        }else return typ;
    }
}
