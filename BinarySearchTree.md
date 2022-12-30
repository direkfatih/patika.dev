Proje 3
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

1- Root olarak 7 rakamını seçip en başa koyuyoruz.
2- İkinci rakam 5, 7'den küçük olduğu için sol tarafına alıyoruz.
3- Üçüncü rakam 1, hem 7'den hem de 5'den küçük olduğu için 5'in sol tarafına alınıyor.
4- Dördüncü rakam 8, 7'den büyük olduğu için 7'nin sağına alıyoruz.
5- Beşinci rakam 3, 7'den ve 5'ten küçük olduğu için sola doğru devam ediyoruz ama 3, 1'den büyük olduğu için 1'in sağına alıyoruz.
6- Altıncı rakam 6, 7'den küçük olduğu için soluna doğru devam eder ama 5'ten büyük olduğu için 5'in sağına alıyoruz.
7- Yedinci rakam 0, 7'den küçük, 5'ten küçük, 1'den de küçük olduğundan dolayı 1'in soluna alıyoruz.
8- Sekizinci rakam 9, 7'den büyük olduğu için 7'nin sağından devam ediyoruz, 9, 8'den de büyük olduğu için 8'in sağına koyuyoruz.
9- Dokuzuncu rakam 4, 7'den ve 5'den küçük olduğu için soldan devam ediyoruz, 
sonra 1'den büyük olduğu için sağa gidiyoruz 3'ten de büyük olduğu için 3'ün sağına yerleştiriyoruz.
10- Son rakamımız 2, 7'den ve 5'ten küçük olduğu için sola gidiyoruz, 1'den büyük olduğu için sağına devam ediyoruz, en son 3'ten küçük olduğu için soluna yerleştiriyoruz.

Binary Search Tree son hali aşağıdaki gibidir.


![Markdown](https://user-images.githubusercontent.com/117915103/210069124-ee7ec8cd-2729-4357-a061-c9d137034e0a.png)
