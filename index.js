import React from "react";
import { AppRegistry, StyleSheet, Text, View} from "react-native";

export default class App extends React.Component {
    render() {
        return (
            <View style={{flex:1}}>
              <Text>Hello world!</Text>
            </View>
        );
  }
}

AppRegistry.registerComponent("MyReactNativeApp", () => App);