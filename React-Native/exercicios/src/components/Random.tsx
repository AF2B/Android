import React, { Component } from "react";
import { Text, View } from "react-native";

type RandomProps = {
  numberOne: number
  numberTwo: number
}

function randomNumber(numberOne: number, numberTwo: number): number {
  return Math.floor(Math.random() * (numberTwo - numberOne + 1) + numberOne)
}

class Random extends Component<RandomProps> {
  render() {
    const { numberOne, numberTwo } = this.props
    const result = randomNumber(numberOne, numberTwo)

    return (
      <View>
        <Text>
          result: {result}
        </Text>
      </View>
    )
  }
}

export default Random