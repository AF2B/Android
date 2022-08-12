import React from "react";
import { ThemeProvider } from "styled-components/native";
import { 
  useFonts,
  Poppins_400Regular, 
  Poppins_500Medium, 
  Poppins_700Bold } from '@expo-google-fonts/poppins';
import AppLoading from 'expo-app-loading';

import { Dashboard } from "./src/screens/Dashboard";
import theme from "./src/global/styles/theme";

function App() {
  // if (!useFonts({ Poppins_400Regular, Poppins_500Medium, Poppins_700Bold })) {
  //   return <AppLoading />
  // }

  return (
    <ThemeProvider theme={theme}>
      <Dashboard />
    </ThemeProvider>
  )
}


export default App;