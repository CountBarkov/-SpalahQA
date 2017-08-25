
'use strict';

let I;

module.exports = {

  _init() {
    I = require('../steps_file.js')();
  },
    email_field:"//input[@id='email']",
    fillEmailField(email){
    I.waitForElement(this.email_field);
        I.fillField(this.email_field,'мыло');
    },
    pass_field:"//input[@id='pass']",
    fillPassField(pass){
        I.waitForElement(this.pass_field);
        I.fillField(this.pass_field,'пароль');
    }

}

  // insert your locators and methods here

