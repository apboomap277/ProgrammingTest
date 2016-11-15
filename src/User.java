public class User implements IUser {
    private String name;
    private String password;
    private int typ;

    public User(int type, String name,String password){
        setTyp(type);
        setName(name);
        setPassword(password);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        String tmp = "[A-Za-z][A-Za-z0-9]{7,}";
        if (name == null) throw new RuntimeException("Name is not true.");
        if (!name.matches(tmp)){
            throw new RuntimeException("Name is not match.");
        }else return this.name = name;
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password) == true){
            return this.password = password;
        }else throw new RuntimeException("Password is not correct.");

    }

    @Override
    public boolean isPasswordCorrect(String password) {
        String tmp = "[A-Za-z0-9]{12,}";
        if (password == null) throw new RuntimeException("Not true.");
        if (password.matches(tmp)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int getType() {
        if(typ <= 0 || typ >=3) {
            throw new RuntimeException("Typ is not true.");
        }else return typ;
    }

    public void setTyp(int typ){
        this.typ = typ;
    }
}
