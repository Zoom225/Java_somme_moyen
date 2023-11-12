import java.util.Scanner;
public class index{   
public static void main(String[] args) {
    
Scanner sc= new Scanner(System.in);

int somme=0;

for(int i =1; i<= 5 ;++i){

System.out.println("entrer le nbre entier " + i + "  :");

int number = sc.nextInt();
somme += number;

}

System.out.println("La moyenne des 5 nombres entiers est " + (somme / 5));


}

}