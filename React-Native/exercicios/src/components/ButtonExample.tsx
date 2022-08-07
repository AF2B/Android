import React, { Component } from "react";
import { Button } from "react-native";

function writeHelloWarn(): void {
  console.warn('Hello Warn!!!')
}

class ButtonExample extends Component {
  render() {
    return (
      <Button title={'Executar!!!'} onPress={writeHelloWarn} />
    );
  }
}

export default ButtonExample;