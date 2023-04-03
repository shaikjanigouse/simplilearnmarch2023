package mypackage;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args)  {
        File folder = new File("C:\\Users\\Jani\\OneDrive\\Desktop\\simplilearn class\\March 2023\\day02project01\\src\\mypackage");
        folder.mkdirs(); 
        Scanner scan = new Scanner(System.in);
        System.out.println("......Assessment 1......");
        System.out.println("..Virtual Key for Your Repositories..");
        System.out.println("Name : Shaik Jani Gouse.\n");
        while(true){

            
            System.out.println("The following functions are :-\n");
            System.out.println("1.Display the files in ascending order\n");
            System.out.println("2.Here are some User Enabled Operations  \n");
            System.out.println("3.Terminate Program \n");
            System.out.println("...Which option do you want to go with!... \n");

            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:

                    File arr[] = folder.listFiles();
                    Arrays.sort(arr);

                    for(int i=0;i<arr.length;i++)
                        System.out.println(arr[i]);
                        break;


                case 2:
                    Boolean temp = true;
                    while(temp) {
                        System.out.println("Option 1 :- Add a file in the existing Directory");
                        System.out.println("Option 2 :- Delete a file from the existing Directory.");
                        System.out.println("Option 3 :- Search a user specified file from the Directory.");
                        System.out.println("Option 4 :- Back to the previous menu.");
                        System.out.println("Option 5 :- Terminate Program.");


                        int choice2 = scan.nextInt();

                        switch (choice2) {
                            case 1:
                                
                                System.out.println("Enter a file name");
                                String name = scan.next();
                                if(new File(folder,name).exists()){
                                    System.out.println("file already exist");
                                }else {
                                    File folder1 = new File(folder, name);
                                    folder1.mkdir();
                                    if (new File(folder, name).exists()) {
                                        System.out.println("file added successfully");
                                    }
                                }

                                break;


                            case 2:
                                System.out.println("Enter a file name");
                                String name1 = scan.next();
                                boolean folder2 = new File(folder, name1).exists();
                                System.out.println(folder2);
                                if (folder2 == true) {
                                    File folder3 = new File(folder, name1);
                                    folder3.delete();
                                    System.out.println("File successfully deleted");
                                } else {
                                    System.out.println("File does not exist");
                                }
                                /*folder2.delete();*/
                                break;


                            case 3:
                                System.out.println("Enter a keyword to search");
                                String search = scan.next();

                                File arr1[] = folder.listFiles();
                                for(int a=0;a<arr1.length;a++){
                                    if(arr1[a].getName().startsWith(search)){
                                        System.out.println(arr1[a]);
                                    }else{
                                        System.out.println("No file found");
                                    }
                                }
                                break;

                            case 4:

                                temp = false;
                                break;

                            case 5:

                                System.out.println("...Program Terminated Successfully...");
                                System.exit(0);
                            default:
                                System.out.println("Enter correct value and retry");

                        }

                    }
                    break;

                case 3:
                    System.out.println("...Program Terminated Successfully...");
                    System.exit(0);

                default:
                    System.out.println("Enter correct value and retry");
                    break;

            }
        }
    }

}



