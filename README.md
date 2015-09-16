# wro4j-boot
Sample of spring boot wro4j configuration

To avoid problems with wro4j trying to load `wro.xml` from `/WEB-INF/` check `Wro4jCustomXmlModelManagerFactory` which loads it directly from `/wro.xml`.

Other details can be found in [blog post](http://blog.instea.sk/2015/08/spring-boot-configuration-of-wro4j/)
