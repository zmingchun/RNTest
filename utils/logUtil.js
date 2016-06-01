'use strict';
var { NativeModules } = require('react-native');

var RCTLog= NativeModules.LogUtil;

var LogUtil = {
  d: function (
    tag: string,
    msg: string
  ): void {
    console.log(tag,msg);
    RCTLog.d(tag, msg);
  },
};

module.exports = LogUtil;
