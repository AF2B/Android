import React, { Component, useState } from "react";
import { Text, Button, View } from 'react-native';
import { StyleSheet } from "react-native";
//FIX-ME
class Counting extends Component {
  constructor(props: number) {
    super(props);
    const [count, setCounting] = useState(0);
  }

  render() {
    return (
      <View style={style.Container}>
        <Text style={style.Text}>{this.state.count}</Text>
        <Button title="Increment" onPress={this.increment} />
        <Button title="Decrement" onPress={this.decrement} />
      </View>
    );
  }

  increment(): void {
    this.setCounting(this.state.count + 1);
    console.warn('Increment');
  }

  decrement(): void {
    this.state.count--;
    console.warn('Decrement');
  }
}

const style = StyleSheet.create({
  Container: {
    flexGrow: 1,
    justifyContent: "center",
    alignItems: "center",
    padding: 10,
    backgroundColor: "#F5FCFF"
  },
  Text: {
    fontSize: 20
  }
}
);

export default Counting;