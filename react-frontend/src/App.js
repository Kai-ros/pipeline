import React, { Component, Fragment } from 'react';

import Contacts from './components/contacts';
import './App.css';

export default class App extends Component {

  state = {
    contacts: []
  }

  componentDidMount() {
    fetch('http://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then(data => {
        this.setState({ contacts: data })
      })
      .catch(console.log)
  }

  render() {
    return (
      <Contacts contacts={this.state.contacts} />
    );
  }
}
