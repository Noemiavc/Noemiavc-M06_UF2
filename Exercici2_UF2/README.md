# Exercici2_UF2

Ens han passat un projecte amb el codi que veieu en aquest repositori. D'altra banda, sols hem creat l'esquema de base de dades (com podeu veure al hibernate.conf.xml, anomenat "clients"), però no hem creat cap taula ni afegit cap camp. Deixarem que hibernate ho faci per nosaltres.

Així, quan anem a executar el projecte, ens dona un error.

Error en la inicialización.  org.hibernate.MappingException: Repeated column in mapping for entity: Model.Cliente column: ciudad (should be mapped with insert="false" update="false")
Exception in thread "main" java.lang.ExceptionInInitializerError
	at app.HibernateUtil.<clinit>(HibernateUtil.java:26)
	at app.App.main(App.java:10)
Caused by: org.hibernate.MappingException: Repeated column in mapping for entity: Model.Cliente column: ciudad (should be mapped with insert="false" update="false")
	at org.hibernate.mapping.PersistentClass.checkColumnDuplication(PersistentClass.java:1007)
	at org.hibernate.mapping.PersistentClass.checkPropertyColumnDuplication(PersistentClass.java:1024)
	at org.hibernate.mapping.PersistentClass.checkPropertyColumnDuplication(PersistentClass.java:1020)
	at org.hibernate.mapping.PersistentClass.checkColumnDuplication(PersistentClass.java:1052)
	at org.hibernate.mapping.PersistentClass.validate(PersistentClass.java:716)
	at org.hibernate.mapping.RootClass.validate(RootClass.java:283)
	at org.hibernate.boot.internal.MetadataImpl.validate(MetadataImpl.java:376)
	at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:298)
	at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:415)
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:746)
	at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:765)
	at app.HibernateUtil.<clinit>(HibernateUtil.java:22)

Es tracta que bé modificant la classe Cliente o bé cambiant alguna configuració hibernate es pugui persistir l'objecte client i per tant que no doni més error.
