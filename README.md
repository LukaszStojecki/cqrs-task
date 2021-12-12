# cqrs-task

## Spis streści
* [Informacje ogólne](#informacje-ogólne)
* [Technologie](#technologie)
* [Funkcje](#funkcje)


## Informacje ogólne
Aplikacja z wykorzystaniem wzorca CQRS, posiadająca  dwie metody.

[POST] AddItem (ID-GUID, Name) - rozkaz (command)
[GET] GetItem (ID-GUID) - zapytanie (query)
 

## Technologie
- JDK 11
- Spring boot
- H2 database
- lombok
- AxonFramework


## Funkcje

Rest Api testowane za pomocą postmana.

POST http://localhost:8080/items

![zapis](https://user-images.githubusercontent.com/65442274/145728114-f7d24134-7e0b-4301-8247-c18f9804e40c.PNG)

GET http://localhost:8080/items/{id} - pobiera item o podanym id

![pobieranie](https://user-images.githubusercontent.com/65442274/145728144-caf26ea9-7279-4031-a537-34d844d13c38.PNG)

