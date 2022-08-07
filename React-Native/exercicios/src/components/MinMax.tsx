import React from 'react'
import { Text, View } from 'react-native'

type MinMaxProps = {
  min: number | string,
  max: number | string
}

function MinMax(param: MinMaxProps): JSX.Element {
  console.warn(param)

  return (
    <View>
      <Text>
        Min: {param.min} - Max: {param.max}
      </Text>
    </View>
  )
}

export default MinMax