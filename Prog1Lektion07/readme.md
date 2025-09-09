Opgave 1
a) Lav en metode der udskriver alle tallene i integerArray. Jeres metode skal tage en
parameter af typen int[] og returnere void.
b) Lav en metode der adderer alle tallen i integerArray. Jeres metode skal tage en
parameter af typen int[] og returnere en int.
c) Lav en metode der finder gennemsnittet af alle tallene i integerArray. Jeres metode
skal tage en parameter af typen int[] og returnere en double.
d) Brug jeres løsning af opgave 6.2 fra bogen til at udregne tværsummen af alle tal i
integerArray. Jeres metode skal tage en parameter af typen int[] og returnere int[].
e) Hvis man tager tværsummen af en tværsum, vil man på et tidspunkt ende med et
enkeltciffer tal.
Eksempel:
Tværsummen af 853 er 8 + 5 + 3 = 16
Tværsummen af 16 er 1 + 6 = 7
For hvert tal i integerArray udregn enkeltciffer tværsummen og returnerer et array der
angiver antallet af tværsum resultater. Dvs. hvor mange gange blev enkeltciffer
tværsummer 1, hvor mange gange 2, osv. optil 9.


Opgave 2
a) Lav en metode der tæller antallet af vokaler i characterArray. Din metode skal tage en
parameter af typen char[] og returnerer int[].
b) Lixtallet for en tekst er defineret ved
O = antal ord i teksten
P = antal punktummer i teksten
L = antal lange ord (over 6 bogstaver lange)
Lix = O / P + L * 100/O
2/3
Lav en metode der tæller antal punktummer i teksten.
Lav en metode der tæller antallet af ord i teksten. En karakter i Java har en
underliggende talværdi ’a’ = 97, ’z’ = 122, ’A’ = 65 og ’Z’ = 90. Ignorere den danske
bogstaver æ, ø og å for denne beregning.
Lav en metode der returnerer antallet af lange ord (over 6 bogstaver lange) i teksten.
Brug disse metoder til at udregne Lixtallet.

Opgave 3
Lav opgave 3.5 fra bogen igen, men denne gang skal du bruge et array i stedet for if-else
sætninger til at udskrive ugedagene. 

Opgave 4
Romertal er et additivt talsystem, dvs. et talsystem hvor man finder tallet ved at adderer de
enkle talsymboler. Denne tabel viser talsymbolerne og deres værdi.
Romertal symbol Værdi
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
Når man skriver et romertal, så skriver man altid det romertal med størst værdig først.
Eksempel:
XXVII = 10 + 10 + 5 + 1 + 1 = 27
En undtagelse for reglen om størst værdig først, er at for X (10) og V (5) må man sætte et
enkelt I (1) foran. Hvis man gør dette, trækker man et fra i stedet for at ligge til.
Så i stedet for at skrive 4 som IIII skriver man 4 som IV. På samme vis skriver man 9 som IX.
3/3
Samme regel gælder for L (50) og C (100), hvor man kan sætte et X foran. Og for D (500) og
M (1000) hvor man kan sætte et C foran.
Eksempel:
CMXLIV = -100 + 1000 – 10 + 50 – 1 + 5 = 944
Lav en metode der kan omregne fra romertal til arabertal.
Opgave 5 *
Opgave 7.18 fra bogen, men brug int i stedet for double. Start med at lave en metode der tager
to parameter i form af et array og et heltal i form af et indeks i array’et, denne metode skal
bytte rundt på elementet på indeks og indeks + 1.
Lav derefter et gennemløb af array’et, så det største element er boblet op til sidste indeks.