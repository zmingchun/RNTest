'use strict';

import React, {
  Component,
  StyleSheet,
  Text,
  View,
  Navigator
} from 'react-native';

import MmList from "./mmList";

export default class main extends Component {
  render() {
    return (
      <Navigator
        initialRoute={{ name: 'mm', component: MmList }}
        // configureScene={(route) => {
        //   return Navigator.SceneConfigs.VerticalUpSwipeJump;
        // } }
        renderScene={(route, navigator) => {
          let Component = route.component;
          return <Component {...route.params} navigator={navigator}  />
        } }

        />
    );
  }
}
