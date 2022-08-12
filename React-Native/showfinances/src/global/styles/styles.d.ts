import 'styled-components-react-native';
import theme from './theme';

declare module 'styled-component' {
  type ThemeType = typeof theme

  export interface DefaultTheme extends ThemeType {}
}