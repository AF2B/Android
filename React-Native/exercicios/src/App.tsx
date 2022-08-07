import React, { View, StyleSheet } from 'react-native'
import { Component } from 'react'
import HelloWorld from './components/HelloWorld'
import MinMax from './components/MinMax'
import Random from './components/Random'
import RandomTwo from './components/RandomTwo'
import CountingTwo from './components/CountingTwo'
import ComponentOne, { ComponentTwo, ComponentThree } from './components/Multiples'

class App extends Component {
  render() {
    return (
      <View style={style.Container}>
        <HelloWorld />
        <ComponentOne />
        <ComponentTwo />
        <ComponentThree />
        <br />
        <MinMax min="10" max="15" />
        <MinMax min={5} max={8} />
        <br />
        <Random numberOne={0} numberTwo={10} />
        <RandomTwo numberOne={20} numberTwo={50} />
        <br />
        <CountingTwo />
      </View>
    )
  }
}

const style = StyleSheet.create({
  Container: {
    flexGrow: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 10,
    backgroundColor: '#F5FCFF'
  },
  Button: {

  },
  ButtonText: {

  }
})

export default App