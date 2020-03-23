package com.jasonzhang.inappupdate

/**
 * Implement this interface to handle forced updates
 */
interface ForceUpdateProvider {
    fun requestUpdateShouldBeImmediate(availableVersionCode: Int, doUpdate: () -> Unit)
}
