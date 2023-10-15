package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {
    HomePage homepage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void acessar_site_qazando() {
        homepage.acessaraplicacao();
    }
    @Quando("^preencho meu e-mail$")
    public void preencho_meu_e_mail() throws InterruptedException {
        homepage.preencheEmail();
    }
    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        homepage.ganharDesconto();
    }
    @Então("^eu vejo o código de desconto$")
        public void eu_vejo_o_codigo_de_desconto(){
            homepage.verificarCupomDesconto();
    }
}
