package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class ConfigBean {

    @EJB
    private StudentBean studentBean;

    @PostConstruct
    private void populateDB() {
        System.out.println("Hello Java EE!");

        studentBean.create(
                "foo",
                "bar",
                "Foo Bar",
                "foo@bar.dev"
        );
    }

}
