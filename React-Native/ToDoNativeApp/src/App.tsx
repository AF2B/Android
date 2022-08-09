import React, { Component } from 'react'
import { SafeAreaView, Text, StyleSheet } from 'react-native'

import styles from './styles/styles'

class App extends Component {
  render() {
    return (
      <SafeAreaView style={styles.container}>
        <Text style={styles.text}>Hello World</Text>
      </SafeAreaView>
    )
  }
}

export default App;