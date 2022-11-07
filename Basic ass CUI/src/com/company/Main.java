[20:26] Naaju, Yarra
        package com.company;
import java.util.Scanner;
public class CUI {​​

    public static void main(String[] args) {​​
        if(!validateUser()) {​​
            System.out.println("Contact Admin");
        }​​
    }​​
    public static boolean validateUser( ) {​​
        boolean result=false;
        String username,[20:26] Naaju, Yarra
    package com.company;
import java.util.Scanner;
        public class CUI {​​

            public static void main(String[] args) {​​
                if(!validateUser()) {​​
                    System.out.println("Contact Admin");
                }​​
            }​​
            public static boolean validateUser( ) {​​
                boolean result=false;
                String username,password;
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<3;i++) {​​
                    System.out.println("Enter the Username");
                    username=sc.nextLine();
                    System.out.println("Enter the Password");
                    password=sc.nextLine();
                    if(username.equals("sunita")&&(password.equals("Wanda"))) {​​
                        System.out.println("Welcome\t"+username);
                        result =true;
                        return result;
                    }​​
                    return result;
                }​​
                return result;
            }​​
        }​​
<https://teams.microsoft.com/l/message/19:uk7zHsI_Q6K6BvKAmCv8wDJHIYdTkP6ZAgW-g7-NhYc1@thread.tacv2/1667573797886?tenantId=76a2ae5a-9f00-4f6b-95ed-5d33d77c4d61&amp;groupId=85c0ab0f-59bb-4ea5-8a6a-e68e9e57f8c1&amp;parentMessageId=1667572132880&amp;teamName=Java Core assignment ON!&amp;channelName=General&amp;createdTime=1667573797886&amp;allowXTenantAccess=false>
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {​​
            System.out.println("Enter the Username");
            username=sc.nextLine();
            System.out.println("Enter the Password");
            password=sc.nextLine();
            if(username.equals("sunita")&&(password.equals("Wanda"))) {​​
                System.out.println("Welcome\t"+username);
                result =true;
                return result;
            }​​
            return result;
        }​​
        return result;
    }​​
}​​
<https://teams.microsoft.com/l/message/19:uk7zHsI_Q6K6BvKAmCv8wDJHIYdTkP6ZAgW-g7-NhYc1@thread.tacv2/1667573797886?tenantId=76a2ae5a-9f00-4f6b-95ed-5d33d77c4d61&amp;groupId=85c0ab0f-59bb-4ea5-8a6a-e68e9e57f8c1&amp;parentMessageId=1667572132880&amp;teamName=Java Core assignment ON!&amp;channelName=General&amp;createdTime=1667573797886&amp;allowXTenantAccess=false>