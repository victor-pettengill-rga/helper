using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Ahs.Native.Helper.RNAhsNativeHelper
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAhsNativeHelperModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAhsNativeHelperModule"/>.
        /// </summary>
        internal RNAhsNativeHelperModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAhsNativeHelper";
            }
        }
    }
}
