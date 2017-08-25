
Feature('Facebook login_logaut');

let email = 'мыло';
let pass = 'пароль';

Scenario('test something', (I,login_facebookPage) => {
    I.amOnPage('https://www.facebook.com/');

    login_facebookPage.fillEmailField(email)
    login_facebookPage.fillPassField(pass)
    I.click("//input[@id='u_0_0']")
    I.wait(15);
    I.click("//div[@id='userNavigationLabel']")
    pause()


});
