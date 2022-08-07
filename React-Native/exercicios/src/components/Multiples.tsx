import React, { View } from 'react-native'
import { Text } from 'react-native'
import { style } from './styles/textG'

function ComponentOne(): JSX.Element {
  return (
    <View>
      <Text style={style.textG}>Component One</Text>
    </View>
  )
}

function ComponentTwo(): JSX.Element {
  return (
    <View>
      <Text>Component Two</Text>
    </View>
  )
}

function ComponentThree(): JSX.Element {
  return (
    <View>
      <Text>Component Three</Text>
    </View>
  )
}

export default ComponentOne
export { ComponentTwo, ComponentThree }