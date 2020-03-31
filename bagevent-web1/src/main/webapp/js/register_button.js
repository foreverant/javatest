'use strict';

const e = React.createElement;

class RegisterButton extends React.Component {
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
      'Register'
    );
  }
}
const domContainer = document.querySelector('#register_button_container');
ReactDOM.render(e(RegisterButton), domContainer);