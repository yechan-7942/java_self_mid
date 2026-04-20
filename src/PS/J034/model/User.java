package PS.J034.model;

public class User {
    private String[] name = { " Kim", "Lee", "park" , " hong" , "choi"};
    private String[] password = { "1111" , "1234", "3456", "3535" , "7777"};



    public String login(String id, String pd){
        for(int i = 0; i < 5; i++){
            if(name[i].equals(id)){
                if(password[i].equals(pd)){
                    return "success";
                }
                else{
                    return "Incorrect Password";
                }
            }
        }
        return "No user";
    }
}
