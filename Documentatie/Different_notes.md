Change in DB

Gen ai in DB un table Player, cu doua coloane: FirstName, Lastname
Si codezi appu incat sa citeasca coloanele amandoua. cand modifici o chestie, trb sa o faci "gracefully" incat sa nu crashuiesti vechiul cod
Gen, sa zicem ca atunci cand creezi un nou Player ai acele doua campuri obligatorii, ca trb sa ii stii nume si prenume
Si gen vine un coleg si adauga un al 3lea camp obligatoriu, Age
Dar uita sa schimbe in cod cand creeazi un player, sa ceara userului sa dea input si age
Ca sa stocheze in noul camp obligatoriu
Ce trb sa se intample aici, e ca modificarea din DB trb backwards compatible, adica trb sa fie specificat in DB ca fieldul Age sa aiba un default value 0, pt ca atunci cand vechiul cod adauga un player fara Age, sa fie adaugat Age = 0, ca sa nu crashuiasca DB

In mod normal schimbarile astea se faceau in vremurile de demult gen, 
1) take production site down for maintenance 
2) deploy change in Db to production
3) deploy new code to ask user also for age on "create player" page
4) inform users site is back up

But that used to take a full day. nowadays, de cand cu cloud computing, se poate asa, close to zero downtime for users: 

1) clone DB in the cloud - you got Database A has only 2 fields in the Player table, Database B has 3 fields in Player table
2) implement code to ask for Age in frontend
3) adaugi un "feature toggle" mechanism (un simplu if case in cod) that says : "is Age feature deployed?" if yes, go to Database B, if not then stay on database A. 
4) deploy frontend cu acest feature toggle, users can still work with old DB
5) deploy new DB with 3 fields in Player table
6) press the switch in the "feature toggle" mechanism to notify frontend that feature was deployed. users dont feel a thing, they will be instantly redirected to Database B ,when creating new players on "create player" page
7) now oyu have unnecesary code leftovers in frontend , acel toggle mechanism nu mai e necesar , since you got a new DB now - clean the code in frontend that makes this switch, redeploy frontend
8) remove the old DB in the cloud

=======================================================

internal
The type or member can be accessed by any code in the same assembly

Same assembly?

Acelasi dll file
Your visual sthdio solution file can contain multiple projects

------

static
Use the static modifier to declare a static member, which belongs to the type itself rather than to a specific object

Belongs to type rather than object, what does that mean? -> not needed to create object / instantiate class - can run its method directly


========================================================

SOLID Programming Priciples:

1. S: Single Responsibility Principle (SRP)
2. O: Open closed Principle (OSP)
3. L: Liskov substitution Principle (LSP)
4. I: Interface Segregation Principle (ISP)
5. D: Dependency Inversion Principle (DIP)

ISP - https://www.youtube.com/watch?v=y1JiMGP51NE&index=4&list=PLLWMQd6PeGY3ob0Ga6vn1czFZfW6e-FLr

=========================================================
