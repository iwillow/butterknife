package butterknife;

import androidx.annotation.LayoutRes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a layoutId to the view for the specified ID. The view will automatically be call setContentView()
 * for activity and dialog.
 * <pre><code>
 * {@literal @}BindLayout(R.layout.main_activity) Activity's layout;
 * {@literal @}BindLayout(R.layout.main_dialog) dialog's layout;
 * </code></pre>
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface BindLayout {
    @LayoutRes int value();
}
