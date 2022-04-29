# **COMBINATION**

## INFORMATION

* **Find the combination of 2 entered numbers.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **i**, **j**, **n**, **r**, **k**, **f**, **a**, **b**, **c** are defined with int.

* The variable **C** is defined with double.

* The scanner scan class is defined to allow the user to enter n and r number values.

* We completed the combination with the if and for module.

## CODES

```Java

        import java.util.Scanner;

        public class combination{

            public static void main(String[] args) {

                int i, j, n, r, k, f = 1, a = 1, b = 1, c = 1;

                double C;

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter The First Number : ");

                n = scan.nextInt();

                System.out.print("Enter The Second Number : ");

                r = scan.nextInt();

```

```Java

                if(n >= r){

                    f = n - r;

                    for(i = 1; i <= n; i++) a *= i;

                    for(j = 1; j <= r; j++) b *= j;

                    for(k = 1; k <= f; k++) c *= k;

                }
                C = a / (b * c);

                System.out.print("C(n,r) Combination = " + C);

            }

        }

```

```bash

       Enter The First Number : 10
        Enter The Second Number : 5
        C(n,r) Combination = 252.0

```

<br />

## LINK

* Click here https://github.com/Fogo9/Combination.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
