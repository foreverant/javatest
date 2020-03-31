'use strict';

const e = React.createElement;

class LoginButton extends React.Component {
  constructor(props) {
    super(props);
    this.state = { liked: false };
  }

  render() {
    if (this.state.liked) {
      return '';
    }

    return e(
      'button',
      { onClick: () => document.forms[0].submit() },
      'Login'
    );
  }
}
const domContainer = document.querySelector('#login_button_container');
ReactDOM.render(e(LoginButton), domContainer);