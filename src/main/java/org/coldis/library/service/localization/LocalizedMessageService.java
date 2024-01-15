package org.coldis.library.service.localization;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

/**
 * Message service.
 */
@Service
public class LocalizedMessageService {

	/**
	 * Message source.
	 */
	@Autowired
	private MessageSource messageSource;

	/**
	 * Gets the message text for the code and arguments.
	 *
	 * @param  code      Message code.
	 * @param  arguments Message arguments.
	 * @return           The message text.
	 */
	public String getMessage(
			final String code,
			final Object... arguments) {
		final Locale locale = LocaleContextHolder.getLocale();
		return this.messageSource.getMessage(code, arguments, locale);
	}

}
