import { Text, View } from 'react-native'

type NumbersProps = {
  numberOne: number
  numberTwo: number
}

function RandomTwo(props: NumbersProps): JSX.Element {
  const { numberOne, numberTwo } = props
  const result = Math.floor(Math.random() * (numberTwo - numberOne + 1) + numberOne)

  return (
    <View>
      <Text>
        result: {result}
      </Text>
    </View>
  )
}

export default RandomTwo