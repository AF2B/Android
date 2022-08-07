import React, { useState } from "react";
import { View, Text, Button } from "react-native";

function CountingTwo() {
  const [count, setCounting] = useState(0);
  const increment = () => setCounting(count + 1);
  const decrement = () => setCounting(count - 1);
  const reset = () => setCounting(0);

  return (
    <View>
      <Text>{count}</Text>
      <Button title="Increment" onPress={increment} />
      <Button title="Decrement" onPress={decrement} />
      <Button title="Reset" onPress={reset} />
    </View>
  );
}

export default CountingTwo;